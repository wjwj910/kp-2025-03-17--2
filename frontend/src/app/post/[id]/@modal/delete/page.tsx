"use client";

import { use } from "react";

import RequireAuthenticated from "@/lib/auth/components/RequireAuthenticated";

import ClientPage from "./ClientPage";

export default function Page({ params }: { params: Promise<{ id: string }> }) {
  const { id } = use(params);

  return (
    <RequireAuthenticated>
      <ClientPage id={id} />
    </RequireAuthenticated>
  );
}
