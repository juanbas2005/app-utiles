.class public abstract Ldd3;
.super Lll4;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lln7;


# instance fields
.field public K:Laa8;

.field public L:Laa8;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lll4;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lgl0;->u:Lfg2;

    .line 5
    .line 6
    iput-object v0, p0, Ldd3;->K:Laa8;

    .line 7
    .line 8
    iput-object v0, p0, Ldd3;->L:Laa8;

    .line 9
    .line 10
    return-void
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


# virtual methods
.method public N0()V
    .locals 2

    .line 1
    new-instance v0, Lcd3;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, Lcd3;-><init>(Ldd3;I)V

    .line 5
    .line 6
    .line 7
    const-string v1, "androidx.compose.foundation.layout.ConsumedInsetsProvider"

    .line 8
    .line 9
    invoke-static {p0, v1, v0}, Lh75;->t(Lvo1;Ljava/lang/Object;Lvr2;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Ldd3;->W0()V

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public O0()V
    .locals 2

    .line 1
    iget-object v0, p0, Ldd3;->K:Laa8;

    .line 2
    .line 3
    iput-object v0, p0, Ldd3;->L:Laa8;

    .line 4
    .line 5
    new-instance v0, Lcd3;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, Lcd3;-><init>(Ldd3;I)V

    .line 9
    .line 10
    .line 11
    const-string v1, "androidx.compose.foundation.layout.ConsumedInsetsProvider"

    .line 12
    .line 13
    invoke-static {p0, v1, v0}, Lh75;->v(Lll4;Ljava/lang/String;Lvr2;)V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final P0()V
    .locals 1

    .line 1
    sget-object v0, Lgl0;->u:Lfg2;

    .line 2
    .line 3
    iput-object v0, p0, Ldd3;->K:Laa8;

    .line 4
    .line 5
    return-void
    .line 6
    .line 7
    .line 8
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

.method public abstract V0(Laa8;)Laa8;
.end method

.method public W0()V
    .locals 2

    .line 1
    iget-object v0, p0, Ldd3;->K:Laa8;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ldd3;->V0(Laa8;)Laa8;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Ldd3;->L:Laa8;

    .line 8
    .line 9
    new-instance v0, Lcd3;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, p0, v1}, Lcd3;-><init>(Ldd3;I)V

    .line 13
    .line 14
    .line 15
    const-string v1, "androidx.compose.foundation.layout.ConsumedInsetsProvider"

    .line 16
    .line 17
    invoke-static {p0, v1, v0}, Lh75;->v(Lll4;Ljava/lang/String;Lvr2;)V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
.end method

.method public final m()Ljava/lang/Object;
    .locals 0

    .line 1
    const-string p0, "androidx.compose.foundation.layout.ConsumedInsetsProvider"

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
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
