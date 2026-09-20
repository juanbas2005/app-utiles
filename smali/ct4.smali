.class public final Lct4;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Lkb9;


# direct methods
.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    const-class v0, Lct4;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lkb9;

    .line 17
    .line 18
    invoke-direct {v0, p1}, Lkb9;-><init>(Landroid/os/Bundle;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lct4;->a:Lkb9;

    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public constructor <init>(Lzs4;)V
    .locals 2

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Lkb9;

    .line 26
    iget-object v1, p1, Lzs4;->x:Lqt4;

    .line 27
    iget-object v1, v1, Lqt4;->x:Lao;

    .line 28
    iget v1, v1, Lao;->a:I

    .line 29
    invoke-direct {v0, p1, v1}, Lkb9;-><init>(Lzs4;I)V

    iput-object v0, p0, Lct4;->a:Lkb9;

    return-void
.end method
