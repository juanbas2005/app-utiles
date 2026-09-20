.class public final Lbg3;
.super Lsj0;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ldb0;


# instance fields
.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V
    .locals 1

    .line 1
    sget-object v0, La42;->w:La42;

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lsj0;-><init>(Ljava/lang/reflect/Method;Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lbg3;->e:Ljava/lang/Object;

    .line 7
    .line 8
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method


# virtual methods
.method public final d([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    array-length v0, p1

    .line 2
    invoke-virtual {p0, v0}, Lsj0;->e(I)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lsj0;->c:Ljava/lang/reflect/Member;

    .line 6
    .line 7
    check-cast v0, Ljava/lang/reflect/Method;

    .line 8
    .line 9
    array-length v1, p1

    .line 10
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object p0, p0, Lbg3;->e:Ljava/lang/Object;

    .line 15
    .line 16
    invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method
