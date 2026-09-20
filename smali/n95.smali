.class public final Ln95;
.super Lwo1;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public M:Lvo1;


# virtual methods
.method public final N0()V
    .locals 2

    .line 1
    iget-object v0, p0, Ln95;->M:Lvo1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v1, v0

    .line 6
    check-cast v1, Lll4;

    .line 7
    .line 8
    iget-object v1, v1, Lll4;->w:Lll4;

    .line 9
    .line 10
    iget-boolean v1, v1, Lll4;->J:Z

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lwo1;->V0(Lvo1;)Lvo1;

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    iput-object v0, p0, Ln95;->M:Lvo1;

    .line 20
    .line 21
    return-void
.end method

.method public final O0()V
    .locals 1

    .line 1
    iget-object v0, p0, Ln95;->M:Lvo1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lwo1;->W0(Lvo1;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
