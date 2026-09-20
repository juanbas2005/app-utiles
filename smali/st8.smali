.class public final Lst8;
.super Lmt8;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final synthetic B:Ltt8;


# direct methods
.method public constructor <init>(Ltt8;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lst8;->B:Ltt8;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1}, Lnk8;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
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
.method public final bridge synthetic get(I)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/AbstractMap$SimpleImmutableEntry;

    .line 2
    .line 3
    iget-object p0, p0, Lst8;->B:Ltt8;

    .line 4
    .line 5
    iget-object p0, p0, Ltt8;->C:Lut8;

    .line 6
    .line 7
    iget-object v1, p0, Lut8;->y:Lqu8;

    .line 8
    .line 9
    iget-object v1, v1, Lqu8;->E:Lmt8;

    .line 10
    .line 11
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object p0, p0, Lut8;->z:Lmt8;

    .line 16
    .line 17
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-direct {v0, v1, p0}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-object v0
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final size()I
    .locals 0

    .line 1
    iget-object p0, p0, Lst8;->B:Ltt8;

    .line 2
    .line 3
    iget-object p0, p0, Ltt8;->C:Lut8;

    .line 4
    .line 5
    iget-object p0, p0, Lut8;->z:Lmt8;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
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
