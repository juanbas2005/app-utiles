.class public final Lxu4;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Ldv5;

.field public b:Z

.field public c:Z

.field public d:I

.field public e:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldv5;

    .line 5
    .line 6
    const/4 v1, 0x6

    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v0, v1, v2}, Ldv5;-><init>(IB)V

    .line 9
    .line 10
    .line 11
    const/4 v1, -0x1

    .line 12
    iput v1, v0, Ldv5;->b:I

    .line 13
    .line 14
    iput v1, v0, Ldv5;->c:I

    .line 15
    .line 16
    iput-object v0, p0, Lxu4;->a:Ldv5;

    .line 17
    .line 18
    iput v1, p0, Lxu4;->d:I

    .line 19
    .line 20
    return-void
    .line 21
.end method
