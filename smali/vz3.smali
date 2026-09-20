.class public final Lvz3;
.super Luq3;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final s:Luz1;


# instance fields
.field public final p:Lj04;

.field public final q:Lig;

.field public r:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Luz1;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1}, Luz1;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lvz3;->s:Luz1;

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

.method public constructor <init>(Lvr2;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lj04;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lj04;-><init>(Lvz3;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lvz3;->p:Lj04;

    .line 10
    .line 11
    new-instance v0, Lig;

    .line 12
    .line 13
    invoke-direct {v0}, Lig;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lvz3;->q:Lig;

    .line 17
    .line 18
    invoke-interface {p1, p0}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public final x()Lig;
    .locals 0

    .line 1
    iget-object p0, p0, Lvz3;->q:Lig;

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
